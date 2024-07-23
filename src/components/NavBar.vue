<template>
  <nav id="navigation" class="position-absolute navbar navbar-expand-sm navbar-dark ms-2 mt-4 p-1">
    <div class="container-fluid">
      <button id="collapse-button" class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse"
        data-bs-target="#navbar-content" aria-controls="navbar-content" aria-expanded="false"
        aria-label="toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbar-content">
        <ul class="navbar-nav">
          <li id="tab-awards" class="nav-item px-2">
            <RouterLink to="/awards"><span class="nav-link">Awards</span></RouterLink>
          </li>
          <li id="tab-events" class="nav-item px-2" style="">
            <RouterLink to="/events"><span class="nav-link">Events</span></RouterLink>
          </li>
          <li id="tab-hof" class="nav-item px-2">
            <RouterLink to="/hof"><span class="nav-link">Hall of Fame</span></RouterLink>
          </li>
          <li id="tab-players" class="nav-item px-2">
            <RouterLink to="/players"><span class="nav-link">Players</span></RouterLink>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>
