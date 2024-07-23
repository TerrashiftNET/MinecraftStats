<template>
    <div id="header" class="clearfix text-center">
        <NavBar />
        <div id="info" class="float-end ms-auto me-2 mt-4 p-2 small text-end" style="display: block;">
            <img id="server-icon" class="me-1 img-textsize-3 align-bottom float-start" title="Server icon"
                src="/server-icon.png">
            <span id="server-name" class="d-none d-sm-inline text-shadow">
                <span class="mc-text-b">
                    <span class="mc-text-l">Server Name</span>
                    <span class="mc-text-4">Server MOTD</span>

                </span>
                <div id="small text-muted">
                    <span class>Last Update:</span>
                    <span id="update-time" class="text-info">Date and time</span>
                </div>
            </span>
        </div>
    </div>
</template>

<script setup>
import NavBar from './NavBar.vue'
</script>