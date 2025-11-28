package de.pdinklag.mcstats;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.regex.Pattern;

/**
 * Reads a set of strings whose keys match a regular expression.
 */
public class RegexSetCountReader extends NestedDataReader {
    private final Pattern[] patterns;

    /**
     * Constructs a regex set count reader.
     *
     * @param path     The JSON object names on the path to the set to read.
     * @param patterns The regular expression patterns to match the keys against.
     */
    public RegexSetCountReader(String[] path, String[] patterns) {
        super(path);
        this.patterns = new Pattern[patterns.length];
        for (int i = 0; i < patterns.length; i++) {
            this.patterns[i] = Pattern.compile(patterns[i]);
        }
    }

    @Override
    protected DataValue getDefaultValue() {
        return new StringSetValue();
    }

    @Override
    protected DataValue read(JSONObject obj, String key) {
        final StringSetValue set = new StringSetValue();
        final JSONObject sub = obj.optJSONObject(key);
        if (sub != null) {
            for (String subKey : sub.keySet()) {
                for (Pattern pattern : patterns) {
                    if (pattern.matcher(subKey).matches()) {
                        set.add(subKey);
                        break;
                    }
                }
            }
        }
        return set;
    }

    @Override
    public DataAggregator createDefaultAggregator() {
        return new StringSetUnionAggregator();
    }
}
