<template>
  <div
  :class="['sm:hidden fixed right-0 h-screen z-30', status ? '-translate-x-0-' : 'translate-x-full', 'overflow-y-auto transition duration-150 ease-in-out bg-black w-48']">
  <ul class="m-6 mt-24 space-y-1">
    <li :class="['flex items-center justify-center m-6']">
      <LangSwitch />
    </li>
    <li>
        <NuxtLink to="#about" class="group hover:text-standard transition duration-300">{{ $t("navbar_links.about") }}</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#experience" class="group hover:text-standard transition duration-300">{{ $t("navbar_links.experience") }}</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#skills" class="group hover:text-standard transition duration-300">{{ $t("navbar_links.projects") }}</NuxtLink>
      </li>
      <li>
        <NuxtLink to="#recommendations" class="group hover:text-standard transition duration-300">{{ $t("navbar_links.recommendations") }}</NuxtLink>
      </li>
      <li>
        <NuxtLink to="https://linktr.ee/mkmuniz" :target="'_blank'"
          class="group hover:text-standard transition duration-300">{{ $t("navbar_links.contact") }}</NuxtLink>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
    name: "SideNavBar",
    props: {
        status: Boolean
    },
};
</script>