const TerserPlugin = require('terser-webpack-plugin')
const path = require('path');

module.exports = {
    entry: './client/index.js',
    output: {
        filename: 'bundle.min.js',
        path: path.join(__dirname, 'public'),
    },
    optimization: {
        minimize: true,
        minimizer: [new TerserPlugin({
                    terserOptions: {
                    mangle: true,  // Enable variable name mangling (obfuscation)
                },
            }
        )],
    },
    /*devServer: {
        contentBase: path.join(__dirname, 'public'),
        proxy: {
        '/api': 'http://localhost:3000',
        },
        compress: true,
        port: 9000,
    },*/
}