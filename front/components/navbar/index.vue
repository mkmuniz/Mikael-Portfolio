<template>
    <div class="w-full border-b-black border grid grid-cols-3">
        <div class="w-full">

        </div>
        <div class="w-full">
            <ul class="flex space-x-3 text-xl m-3">
                <li>
                    <NuxtLink to="#about" class="hover:text-gray-600 transition-all">
                        About Me
                    </NuxtLink>
                </li>
                <li>
                    <NuxtLink to="#about" class="hover:text-gray-600 transition-all">
                        Experience
                    </NuxtLink>
                </li>
                <li>
                    <NuxtLink to="#about" class="hover:text-gray-600 transition-all">
                        Projects
                    </NuxtLink>
                </li>
                <li>
                    <NuxtLink to="#about" class="hover:text-gray-600 transition-all">
                        Contacts
                    </NuxtLink>
                </li>
            </ul>
        </div>
        <div class="w-full text-center">
            <Icon class="text-5xl" name="ri:account-circle-fill" color="black" />
        </div>
    </div>
</template>