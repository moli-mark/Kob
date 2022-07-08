<template>
  <div>
    <div>Bot name: {{bot_name}}</div>
    <div>Bot score: {{bot_score}}</div>
  </div>
<router-view></router-view>
</template>

<script>
import $ from 'jquery';
import {ref} from 'vue';

export default{
  name:"App",
  setup:()=>{
    let bot_name=ref("");
    let bot_score=ref("");

    $.ajax({
      url:"http://localhost:3000/pk/getbotinfo/",
      type:"get",
      success:resp=>{
        bot_name.value=resp.name;
        bot_score.value=resp.score;
      }
    });

    return {
      bot_name,
      bot_score
    }
  }
}
</script>

<style>
body{
  background-image: url("~@/assets/background.png");
  background-size:cover;
}
</style>
