# Web Worker demo with ClojureScript 1.10.x

To build it, run:

```bash
clj --main cljs.main --serve localhost:7777 --target webworker --output-to mywebworker.js --compile mywebworker.core
```

Go to http://localhost:7777 and see the web worker print to your console.


## Trivia

For reference, a `build.clj` is included, which would do the same as the command above, without launching a web server.
