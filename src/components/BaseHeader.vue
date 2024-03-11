<template>
    <div id="header" class="clearfix text-center">
        <div id="info" class="float-end ms-auto me-2 mt-4 p-2 small text-end" style="display: block;">
            <!-- <img id="server-icon" class="me-1 img-textsize-3 align-bottom float-start" title="Server icon"
                src="data/server-icon.png"> -->
            <span id="server-name" class="d-none d-sm-inline text-shadow">
                <span class="mc-text-b">
                    <span class="mc-text-l">Server Name</span>
                    "-"
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

<style scoped>
#header {
    height: 64px
}

.text-center {
    text-align: center !important;
}

#info {
    background-color: black;
    border-radius: .5rem;
}

.text-end {
    text-align: right !important;
}

.p-2 {
    padding: .5rem !important;
}

.ms-auto {
    margin-left: auto !important;
}

.me-2 {
    margin-right: .5rem !important;
}

.mt-4 {
    margin-top: 1rem !important;
}

.float-end {
    float: right !important;
}

.small, small {
    font-size: 80% !important;
}

img-textsize-3 {
    height: 3rem !important;
}

.me-1 {
    margin-right: .25rem !important;
}

.float-start {
    float: left !important;
}

.align-bottom {
    vertical-align: bottom;
}

img {
    vertical-align: middle;
}

.text-shadow {
    text-shadow: 2px 2px rgba(0, 0, 0, 0.5);
}

@media (min-width: 576px) {
    .d-sm-inline {
        display: inline;
    }
}

.d-none {
    display: none;
}

.mc-text-b {
    color: #5ff
}

.mc-text-l {
    font-weight: bold;
}

.mc-text-4 {
    color: #a00;
}

.text-muted {
    color: white !important;
}

.text-info {
    color: #7373ff !important;
}

#update-time {
    font-weight: bold;
}
</style>