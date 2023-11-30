<template>
    <div class="w-full text-white font-hubot flex">
        <NuxtLink to="/">
            <NuxtImg src="/images/logo.png" class="w-12 m-6" />
        </NuxtLink>
        <div class="w-full sm:flex items-center justify-end sm:visible hidden">
            <ul class="flex space-x-3 text-xl m-3">
                <li>
                    <NuxtLink to="#about" class="group hover:text-standard transition duration-300">
                        ABOUT ME
                        <span
                            class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                    </NuxtLink>
                </li>
                <li>
                    <NuxtLink to="#experience" class="group hover:text-standard transition duration-300">
                        EXPERIENCE
                        <span
                            class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                    </NuxtLink>
                </li>
                <li>
                    <NuxtLink to="#projects" class="group hover:text-standard transition duration-300">
                        PROJECTS
                        <span
                            class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                    </NuxtLink>
                </li>
                <li>
                    <NuxtLink to="#contact" class="group hover:text-standard transition duration-300">
                        CONTACT
                        <span
                            class="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-standard"></span>
                    </NuxtLink>
                </li>
            </ul>
        </div>
        <div class="sm:hidden visible w-full flex items-center justify-end">
            <HamburgerButton :getNavBarStatus="getNavBarStatus" />
        </div>
        <SideNavBar :status="status" />
    </div>
</template>

<script>
import HamburgerButton from '../HamburgerButton/index.vue';
export default {
  name: "NavBar",
  data() 
  {
    return {
      status: Boolean
    }
  },
  components: {
    HamburgerButton
  },
  methods: {
    getNavBarStatus(status) {
        this.status = status
    }
  }
}
</script>