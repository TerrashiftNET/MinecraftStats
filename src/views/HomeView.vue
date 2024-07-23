<template>
  <div id="view" class="container mx-auto">
    <div class="h1 my-4 text-center">
      <img id="view-icon" class="img-pixelated img-left img-textsize align-baseline" style="display: none" />
      <span id="view-title" class="text-underline text-shadow">Award Overview</span>
      <div id="view-content">
        <div class="text-center align-middle" v-if="items.length === 0">
          <p>Loading...</p>
        </div>
        <div class="grid" v-else :style="{ gridTemplateColumns: gridColumnCount }">
          <AwardItem v-for="item in items" :key="item.id" :stat="item.stat" :title="item.title" :holder="item.name"
            :value="item.value" :face="item.face" />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import AwardItem from '../components/AwardItem.vue';
export default {
  components: {
    AwardItem
  },
  data() {
    return {
      items: []
    }
  },
  created() {
    this.fetchItemsFromDatabase().then((data) => {
      this.items = data
    })
  },
  computed: {
    gridColumnCount() {
      const numItems = this.items.length
      const columns = numItems >= 3 ? 3 : numItems
      return `repeat(${columns}, 1fr)`
    }
  },
  methods: {
    fetchItemsFromDatabase() {
      return new Promise((resolve) => {
        setTimeout(() => {
          resolve([
            {
              id: 1,
              name: 'Player 1',
              face: 'aeddaba78a5be1b40be04e10d88556ad4ea0be0fc6c4d78914d1ed9077f04e34',
              stat: 'break_tools',
              value: 100,
              title: "Tools Breaker",
            },
            {
              id: 2,
              name: 'Player 2',
              face: 'aeddaba78a5be1b40be04e10d88556ad4ea0be0fc6c4d78914d1ed9077f04e34',
              stat: 'death',
              value: 50,
              title: "Death Master",
            },
            {
              id: 3,
              name: 'Player 3',
              face: 'aeddaba78a5be1b40be04e10d88556ad4ea0be0fc6c4d78914d1ed9077f04e34',
              stat: 'mine_coal_ore',
              value: 1000,
              title: "Coal Miner",
            },
            {
              id: 4,
              name: 'Player 4',
              face: 'aeddaba78a5be1b40be04e10d88556ad4ea0be0fc6c4d78914d1ed9077f04e34',
              stat: 'place_glass',
              value: 2000,
              title: "Glass Placer",
            }
          ])
        }, 1000)
      })
    }
  }
}
</script>

<style>
.grid {
  /* create a 3 wide grid */
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-gap: 1rem;
}
</style>
