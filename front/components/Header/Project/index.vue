<script>
    export default {
        props: ["test"],
        onMounted() {
            console.log(this.test)
        }
    }
</script>

<template>
    <div class="bg-red-600 w-full text-center">
        <div class="grid grid-cols-2 w-ful h-screen">
            <div class="w-full flex flex-col space-y-4 justify-center items-center">
                <div class="w-11/12 h-3/6 rounded bg-slate-700">

                </div>
                <div class="w-11/12 h-1/6 rounded bg-slate-700">

                </div>
            </div>
            <div class="w-full flex flex-col space-y-4 justify-center items-center">
                <div class="w-11/12 h-3/6 rounded bg-slate-700">

                </div>
            </div>
        </div>
    </div>
    <h1>Teste</h1>
</template>