
(require '[cljs.build.api :as api])

(api/build "src"
           {:target :webworker
            :main 'mywebworker.core
            :output-to "mywebworker.js"})
