# reagent tutorial
## creating this project
lein new reagent-frontend simpletodo +shadow-cljs

### Development mode
```
npm install
npx shadow-cljs watch app
```
start a ClojureScript REPL
```
npx shadow-cljs browser-repl
```
### Building for production

```
npx shadow-cljs release app
```
### use fixed ip
then this one is simpler, just replace localhost with fixed ip will do

## apply csse
go to [sakura: a minimal classless css framework / theme](https://oxal.org/projects/sakura/)

find cdn and add 