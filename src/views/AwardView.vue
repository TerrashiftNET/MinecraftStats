<template>
  <div id="content" style="display: block">
    <div id="view" class="container mx-auto">
      <div class="h1 my-4 text-center">
        <span id="view-title" class="text-underline text-shadow">
          {{ $route.params.id }}
        </span>
      </div>
      <div id="view-subtitle" class="text-center text-shadow" style>Award Ranking</div>
      <div id="view-content">
        <div v-if="isLoading">
          <div class="text-center">Loading...</div>
        </div>
        <div v-else>
          <div class="mcstats-entry p-1">
            <div class="round-box p-1">
              <table class="table table-responsive-xs table-hover table-sm">
                <thead>
                  <tr>
                    <th scope="col" class="text-end text-shadow">Rank</th>
                    <th scope="col" class="text-start text-shadow">Player</th>
                    <th scope="col" class="text-center text-shadow">{{ this.id }}</th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="(entry, index) in leaderboard" :key="index">
                    <td class="text-end text-shadow">{{ index + 1 }}</td>
                    <td class="text-start text-shadow">{{ entry.id }}</td>
                    <td class="text-center text-shadow">{{ entry.value }}</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { useRoute } from 'vue-router'
import { ref } from 'vue'

export default {
  async setup() {
    const leaderboards = import.meta.glob('../assets/output/data/leaderboards/*.json')
    const route = useRoute()
    const id = route.params.id
    const isLoading = ref(true)
    const leaderboard = ref(null) // Initialize leaderboard as null

    try {
      const allData = await Promise.all(Object.values(leaderboards)) // Fetch all data

      const matchingData = allData.find((data) => data.filename.includes(id)) // Match filename
      if (matchingData) {
        console.log(matchingData)
        leaderboard.value = matchingData.entries // Assign entries if found
      } else {
        // Handle case where no matching data is found (optional: display error message)
      }
      isLoading.value = false
    } catch (error) {
      console.error('Error loading leaderboard:', error)
      // Handle errors gracefully (e.g., display an error message)
    }
    console.log(leaderboard.value)
    return { isLoading, leaderboard, id }
  }
}
</script>
