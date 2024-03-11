import { routerLink}

<template>
    <nav id="navigation" class="position-absolute navbar navbar-expand-sm navbar-dark ms-2 mt-4 p-1" style="">
            <div class="container-fluid">
                <button id="collapse-button" class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#navbar-content" aria-controls="navbar-content" aria-expanded="false" aria-label="toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbar-content">
                    <ul class="navbar-nav">
                        <li id="tab-awards" class="nav-item px-2">
                            <a class="nav-link" href="#awards"><span class="">Awards</span></a>
                        </li>
                        <li id="tab-events" class="nav-item px-2" style="">
                            <a class="nav-link" href="#events"><span class="">Events</span></a>
                        </li>
                        <li id="tab-hof" class="nav-item px-2">
                            <a class="nav-link" href="#hof"><span class="">Hall of Fame</span></a>
                        </li>
                        <li id="tab-players" class="nav-item px-2">
                            <a class="nav-link" href="#players"><span class="">Players</span></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
</template>

<style scoped>
#navigation {
    background-color: black;
    border-radius: .5rem;
    align-items: center;
    justify-content: center;
    display: flex;
    flex-direction: row;
    align-content: center;
}

.p-1 {
    padding: .25rem !important;
}

.ms-2 {
    margin-left: .5rem !important;
}

.mt-4 {
    margin-top: 1rem !important;
}

.position-absolute {
    position: absolute !important;
}

@media (min-width: 576px) {
    .navbar-expand-sm {
        flex-wrap: nowrap;
        justify-content: flex-start;
    }
}

.navbar {
    position: relative;
    display: flex;
    flex-wrap: wrap;
    align-items: center;
    justify-content: space-between;
    padding-top: .5rem;
    padding-bottom: .5rem;
}

.container-fluid {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;    
}
.navbar>.container, .navbar>.container-fluid, .navbar>.container-lg, .navbar>.container-md, .navbar>.container-sm, .navbar>.container-xl, .navbar>.container-xxl {
    display: flex;
    flex-wrap: inherit;
    align-items: center;
    justify-content: space-between;

}

.navbar-dark .navbar-toggler {
    background-color: rgba(0, 0, 0, .5);
    border-width: 1px;
    border-color: #333;
    color: rgba(255, 255, 255, .5);
}

@media (min-width: 576px) {
    .navbar-expand-sm .navbar-toggler {
        display: none;
    }
}

[type="button"]:not(:disabled), [type="reset"]:not(:disabled), [type="submit"]:not(:disabled), button:not(:disabled) {
    cursor: pointer;
}

.navbar-toggler {
    padding: .25rem .75rem;
    font-size: 1.25rem;
    line-height: 1;
    background-color: transparent;
    border: 1px solid transparent;
    border-radius: .25rem;
    transition: box-shadow .15s ease-in-out;
}

[type=button], [type=reset], [type=submit], button {
    -webkit-appearance: button;
    appearance: button;
}

button, select {
    text-transform: none;
}

button, input, optgroup, select, textarea {
    margin: 0;
    font-family: inherit;
    font-size: inherit;
    line-height: inherit;
}

button {
    border-radius: 0;
}

.navbar-dark .navbar-toggler-icon {
    background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 30 30'%3e%3cpath stroke='rgba%28255, 255, 255, 0.55%29' stroke-linecap='round' stroke-miterlimit='10' stroke-width='2' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");;
}

.navbar-toggler-icon {
    display: inline-block;
    width: 1.5em;
    height: 1.5em;
    vertical-align: middle;
    content: "";
    background-repeat: no-repeat;
    background-position: center;
    background-size: 100%;
}

.navbar-collapse {
    flex-basis: 100%;
    flex-grow: 1;
    align-items: center;
}

@media (min-width: 576px) {
    .navbar-expand-sm {
        flex-direction: row;
    }
}

.px-2 {
    padding-left: .5rem !important;
    padding-right: .5rem !important;
}

@media (min-width: 576px) {
    .navbar-expand-sm .navbar-nav {
        flex-direction: row;
    }

    .navbar-nav {
        display: flex;
        flex-direction: column;
        padding-left: 0;
        margin-bottom: 0;
        list-style: none;
    }
}

dl, ol, ul {
    margin-top: 0;
    margin-bottom: 1rem;
}

ol, ul {
    padding-left: 2rem;
}

.navbar-dark .navbar-nav .nav-link {
    color: rgba(255, 255, 255, .55);
}

@media (min-width: 576px) {
    .navbar-expand-sm .navbar-nav .nav-link {
        padding-right: .5rem;
        padding-left: .5rem;
    }
}

.nav-link {
    display: block;
    padding: .5rem 1rem;
    color: rgba(255, 255, 255, .55);
    text-decoration: none;  
    transition: color .15s ease-in-out, background-color .15s ease-in-out, border-color .15s ease-in-out;
}

a { 
    color: #fff;
    text-decoration: none;
    text-align: center;
}

a {
    color: #0d6efd;
    text-decoration: underline;
}





</style>