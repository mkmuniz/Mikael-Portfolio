
<template>
    <button
        class="flex flex-col h-12 w-12 border-2 border-black rounded justify-center items-center group sm:hidden visible"
        @click="toggleIsOpen(); getNavBarStatus(isOpen)">
        <div
            :class="[genericHamburgerLine, isOpen ? 'rotate-45 translate-y-3 group-hover:opacity-100' : 'group-hover:opacity-100']">
        </div>
        <div :class="[genericHamburgerLine, isOpen ? 'opacity-0' : 'group-hover:opacity-100']"></div>
        <div
            :class="[genericHamburgerLine, isOpen ? '-rotate-45 -translate-y-3 group-hover:opacity-100' : 'group-hover:opacity-100']">
        </div>
    </button>
</template>
    
<script>
export default {
    props: {
        getNavBarStatus:Function
    },
    data() {
        return {
            isOpen: false,
            genericHamburgerLine: `h-1 w-6 my-1 z-50 rounded-full bg-white transition ease transform duration-300`
        };
    },
    methods: {
        toggleIsOpen() {
            this.isOpen = !this.isOpen;
        }
    }
};
</script>
    