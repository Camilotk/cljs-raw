;; Call the ClojureScript Compiler as function
(require '[cljs.build.api :as cljs])

(def compiler-options {:output-to "compile.js"})

(cljs/build "cljs" compiler-options)