<template>
  <div style="position:absolute; top:0px; width:100%">
    <b-navbar type="dark" variant="primary" toggleable>
    <b-navbar-toggle target="nav_dropdown_collapse"></b-navbar-toggle>
    <b-collapse is-nav id="nav_dropdown_collapse">
      <b-navbar-nav>
        <b-nav-item href="#">Account Manager</b-nav-item>
        <b-nav-item-dropdown text="Views" right>
          <router-link to="/viewall">View all accounts</router-link>
          <router-link to="/search">Search accounts</router-link>
        </b-nav-item-dropdown>
        <b-nav-item-dropdown text="Accounts" right>
          <router-link to="/addordelete">Add/Delete account</router-link>
          <router-link to="/update">Update account</router-link>
        </b-nav-item-dropdown>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
  </div>
</template>

<script>
export default {
  name: 'NavigationBar'
}
</script>

<style>

</style>
