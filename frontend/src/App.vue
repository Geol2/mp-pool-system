<script>
import LoginComponent from "/@components/LoginComponent.vue"
import {defineComponent} from 'vue';
import "@marcoschulte/vue3-progress/dist/"

export default defineComponent({
  name: 'MpPoolApp',
  components: {
    LoginComponent,
  },
  data() {
    return {
      progresses: []
    }
  },
  mounted() {
    // debugger;
    this.stop();
    //debugger;
  },
  created() {
    // debugger;
    this.start();
    //debugger;
  },
  methods: {
    start() {
        const progress = this.$progress.start();
        this.progresses.push(progress);
    },
    stop() {
        this.progresses.pop()?.finish();
    },
  }
})
</script>

<template>
  <div>
    <router-view></router-view>
    <Vue3ProgressBar></Vue3ProgressBar>
    <!-- <LoginComponent></LoginComponent> -->
  </div>
</template>