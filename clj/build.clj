;; Call the ClojureScript Compiler as function
(require '[cljs.build.api :as cljs])

;; Compiler options:
;; :output-to = define the name of the output file
(def compiler-options {:output-to "compiled.js"})

(cljs/build "cljs" compiler-options)