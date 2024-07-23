<template>
    <div id="col-sm">
        <div class="container p-1 mb-3 mcstats-entry">
            <div class="h4 p-1 mb-1 round-box text-center align-middle">
                <img class="img-pixelated img-textsize align-baseline" :src="getImageUrl(stat)" :alt="stat"
                    :title="title" />
                <router-link :to="`/award/${title}`">{{ title }}</router-link>
            </div>
            <div class="p-1 round-box text-center">
                <canvas width="8" height="8"
                    class="minecraft-face d-inline-block img-pixelated textw-1_5 texth-1_5 align-baseline me-1"
                    ref="canvas">
                </canvas>
                <router-link :to="`/player/${holder}`">{{ holder }}</router-link>
                <br />
                <a class="text-center">
                    {{ title }}:
                    <span class="text-data"> {{ value }}</span>
                </a>
            </div>
        </div>
    </div>
</template>

<script>

export default {
    name: 'AwardItem',
    props: {
        stat: String,
        id: String,
        title: String,
        holder: String,
        value: Number,
        face: String,
    },
    mounted() {
        this.func();
    },
    methods: {
        func() {
            let cvn = this.$refs.canvas;
            let ctx = cvn.getContext('2d');
            let img = new Image();
            img.src = `https://textures.minecraft.net/texture/${this.face}`;
            ctx.imageSmoothingEnabled = false;
            ctx.drawImage(img, 8, 8, 8, 8, 0, 0, cvn.width, cvn.height);
            ctx.drawImage(img, 40, 8, 8, 8, 0, 0, cvn.width, cvn.height);
        },
    },
};

</script>

<script setup>
function getImageUrl(name) {
    return new URL(`../assets/img/award-icons/${name}.png`, import.meta.url).href
}
</script>
