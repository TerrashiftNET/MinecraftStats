<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div id="content" style="display: block">
  <RouterView />
  </div>
</template>

<style scoped>
*
{
  box-sizing: border-box;
}

div {
  unicode-bidi: isolate;
}

body {
  font-family: minecraftia,Zpix,monospace;
    color: #eee;
    background-position: left top,left 64px,left 128px;
    background: linear-gradient(-235deg,#565eb5 10%,#fd90af 100%);
}
</style>
