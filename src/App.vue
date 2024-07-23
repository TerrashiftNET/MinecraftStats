<script setup>
import { RouterView } from 'vue-router'
import BaseHeader from './components/BaseHeader.vue'
</script>

<template>
  <BaseHeader />

  <div id="content" style="display: block">
    <Suspense>
      <RouterView> </RouterView>
    </Suspense>
  </div>
</template>
