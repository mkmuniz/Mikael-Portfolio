<template>
  <div
    :class="['fixed right-0 h-screen z-30', status ? '-translate-x-0-' : 'translate-x-full', 'overflow-y-auto transition duration-150 ease-in-out bg-black w-48']">
    <ul class="m-6 mt-24 space-y-1">
      <li>
        <NuxtLink to="#about" class="group hover:text-standard transition duration-300">ABOUT ME</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#experience" class="group hover:text-standard transition duration-300">EXPERIENCE</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#skills" class="group hover:text-standard transition duration-300">SKILLS</NuxtLink>
      </li>
      <li>
        <NuxtLink to="https://linktr.ee/mkmuniz" :target="'_blank'" class="group hover:text-standard transition duration-300">CONTACT</NuxtLink>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  props: {
    status: Boolean
  }
};
</script>