<template>
  <div>
    <NavigationBar></NavigationBar>
    <p>First name     :</p><input type="text">
    <p>Last name      :</p><input type="text">
    <p>Account number :</p><input type="text">
    <input type="button">
  </div>
</template>

<script>
import NavigationBar from './NavigationBar.vue'
export default {
  name: 'AddDelete',
  components: {
    NavigationBar
  }
}
</script>
import Vue from 'vue'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
<style>

</style>
