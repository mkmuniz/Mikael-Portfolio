import type { Config } from 'tailwindcss'

/** @type {import('tailwindcss').Config} */
export default <Partial<Config>>{
  content: [
    "./node_modules/flowbite/**/*.{js,ts}"
  ],
  theme: {
    extend: {
      screens: {
        'mobile': { 'max': '639px' },
        'mobile-l': { 'min': '425px', 'max': '639px' },
        'mobile-m': { 'min': '375px', 'max': '424px' },
        'mobile-s': { 'min': '320px', 'max': '374px' },
        'tablet': {'min': '639px', 'max': '1023px'},
        '3xl': { 'min': '1440px' }
      },
      plugins: [
        require('flowbite/plugin')
      ],

      colors: {
        standard: "#FC1616"
      },
      fontFamily: {
        hubot: ['HUBOT', 'cursive'],
      },
      container: {
        padding: {
          DEFAULT: '1rem',
          sm: '2rem',
          lg: '4rem',
          xl: '5rem',
          '2xl': '6rem',
        },
      },
    }
  }
}
