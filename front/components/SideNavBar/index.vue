<template>
  <div
    :class="['absolute h-screen z-30', status ? '-translate-x-0' : '-translate-x-full', 'overflow-y-auto transition duration-150 ease-in-out bg-standard w-48']">
    <ul class="m-6 mt-24 space-y-1">
      <li>
        <NuxtLink to="#about">ABOUT ME</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#experience">EXPERIENCE</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#skills">SKILLS</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#projects">PROJECTS</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#contact">CONTACT</NuxtLink>
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