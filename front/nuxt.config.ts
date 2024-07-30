// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  devtools: { enabled: true },

  modules: [
    '@nuxtjs/tailwindcss',
    'nuxt-icon',
    '@nuxt/image',
    '@nuxtjs/i18n',
    "@pinia/nuxt"
  ],

  i18n: {
    lazy: false,
    langDir: "locales",
    strategy: "no_prefix",
    locales: [
      {
        code: 'pt-BR',
        iso: 'pt-BR',
        name: 'Portuguese (BR)',
        file: 'pt-BR.json'
      },
      {
        code: 'en-US',
        iso: 'en-US',
        name: 'English (US)',
        file: 'en-US.json'
      },
    ],
    defaultLocale: "pt-BR"
  },

  devServer: {
    port: Number(process.env.PORT)
  },

  hooks: {
    'close': () => {

    }
  },

  app: {
    head: {
      charset: 'utf-8',
      viewport: 'width=device-width, initial-scale=1',
    },
  },

  compatibilityDate: '2024-07-27'
})