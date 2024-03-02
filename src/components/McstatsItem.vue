<script setup> 
var props = defineProps(['name', 'stat', 'user', 'value', "skin_url"])
const base_url = 'https://textures.minecraft.net/texture/'
const icon = base_url + props.skin_url

// crop the face from the skin 
import { ref } from 'vue'

const canvas = ref()
import { onMounted } from 'vue'

onMounted(() => {
    const ctx = canvas.value.getContext('2d')
    const img = new Image()
    img.src = icon
    img.class = 'mc-skin'
    img.onload = () => {
        ctx.drawImage(img, 8, 8, 8, 8, 0, 0, 32, 32)
        ctx.imageSmoothingEnabled = false
      }
})
</script>

<template>
    <div class="mcstats-item">
        <div class="mcstats round-box">
            <a :href="stat">{{ name }}</a>
        </div>
        <div class="mcstats round-box">
            <canvas ref="canvas" width="32" height="32" class="mc-skin">
            </canvas>
            <br>
            <p>{{ stat }}:</p>
            <p> {{ value }}</p>
        </div>
    </div>
</template>

<style scoped>
.round-box {
    border-radius: 10px;
    border: 1px solid #000;
    box-shadow: 0 0 10px #000;
    padding: 10px;
    margin: 10px;
    text-align: center;
}

/* canvas {
    border-radius: 50%;
    border: 1px solid #000;
    box-shadow: 0 0 10px #000;
} */

.mc-skin {
  /* "official" proposal */
  image-rendering: pixelated;
  /* Firefox (and others?) */
  image-rendering: optimizeSpeed;
  /* Internet Exploder */
  -ms-interpolation-mode: nearest-neighbor;
}

</style>
