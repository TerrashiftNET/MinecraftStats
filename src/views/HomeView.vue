<template>
  <div id="view" class="container mx-auto">
    <div class="h1 my-4 text-center">
      <img id="view-icon" class="img-pixelated img-left img-textsize align-baseline" style="display: none;">
      <span id="view-title" class="text-underline text-shadow">Award Overview</span>
    </div>
    <div id="view-content">
      <div v-if="items.length === 0">
        <p>Loading...</p>
      </div>
      <div v-for="item in items" :key="item.id" id="col-sm">
        <div class="container p-1 mb-3 mcstats-entry">
          <div class="h4 p-1 round-box text-center align-middle">
            <a :href="item.stat">{{ item.stat }}</a>
          </div>
          <div class="p-1 round-box text-center">
            <canvas width="8" height="8"
              class="minecraft-face d-inline-block img-pixelated textw-1_5 align-baseline me-1">
              <img :src="item.face" alt="Minecraft face" class="d-none">
            </canvas>
            <a :href="item.name">{{ item.name }}</a>
            <br>
            :"{{ item.stat }}"
            <span class="text-data">({{ item.value }})</span>
          </div>
        </div>
      </div>
    </div>
  </div>

</template>

<script>
export default {
  data() {
    return {
      items: []
    };
  },
  created() {
    this.fetchItemsFromDatabase()
      .then((data) => {
        this.items = data;
      });
  },
  computed: {
    gridColumnCound() {
      const numItems = this.items.length;
      const colums = Math.ceil(Math.sqrt(numItems));
      return `repeat(${colums}, 1fr)`;
    },
  },
  methods: {
    fetchItemsFromDatabase() {
      return new Promise((resolve) => {
        setTimeout(() => {
          resolve([
            {
              id: 1,
              name: 'Player 1',
              face: 'https://crafatar.com/avatars/1',
              stat: 'Kills',
              value: 100,
            },
            {
              id: 2,
              name: 'Player 2',
              face: 'https://crafatar.com/avatars/2',
              stat: 'Deaths',
              value: 50,
            },
            {
              id: 3,
              name: 'Player 3',
              face: 'https://crafatar.com/avatars/3',
              stat: 'Blocks broken',
              value: 1000,
            },
            {
              id: 4,
              name: 'Player 4',
              face: 'https://crafatar.com/avatars/4',
              stat: 'Blocks placed',
              value: 2000,
            },
          ]);
        }, 1000);
      });

    }
  }
};
</script>

<style scoped>
#view-content {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 1rem;
  padding: 1rem;
  margin: 0 auto;
  max-width: 1200px;
}

#col-sm {
  display: grid;
  grid-template-columns: 1fr;
  gap: 1rem;
  padding: 1rem;
  margin: 0 auto;
  max-width: 1200px;
}

.mcstats-entry {
  display: grid;
  grid-template-columns: 1fr;
  gap: 1rem;
  padding: 1rem;
  margin: 0 auto;
  max-width: 1200px;
}

.mcstats-item {
  display: grid;
  grid-template-columns: 1fr;
  gap: 1rem;
  padding: 1rem;
  margin: 0 auto;
  max-width: 1200px;
}

.round-box {
  border-radius: 0.5rem;
  background-color: #f0f0f0;
  box-shadow: 0 0 0.5rem rgba(0, 0, 0, 0.1);
}

.text-center {
  text-align: center;
}

.align-middle {
  align-items: center;
}

.align-baseline {
  align-items: baseline;
}

.textw-1_5 {
  width: 1.5rem;
}

.text-data {
  font-size: 0.8rem;
  color: #666;
}

.minecraft-face {
  width: 1.5rem;
  height: 1.5rem;
  border-radius: 0.5rem;
  overflow: hidden;
  background-color: #fff;
  box-shadow: 0 0 0.5rem rgba(0, 0, 0, 0.1);
}

.minecraft-face img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: center;
  image-rendering: pixelated;
  image-rendering: crisp-edges;
}

.img-pixelated {
  image-rendering: pixelated;
  image-rendering: crisp-edges;
}

.d-none {
  display: none;
}

.mx-auto {
  margin-left: auto !important;
  margin-right: auto !important;
}

.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}

@media (min-width: 576px) {
  .container {
    max-width: 540px;
  }
}

@media (min-width: 768px) {
  .container {
    max-width: 720px;
  }
}

@media (min-width: 992px) {
  .container {
    max-width: 960px;
  }
}

@media (min-width: 1200px) {
  .container {
    max-width: 1140px;
  }
}

</style>
