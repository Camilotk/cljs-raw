;; Call the ClojureScript Compiler as function
(require '[cljs.build.api :as cljs])

;; Compiler options:
;; :output-to = define the name of the output file
;; :main = tells the namespace of main goog compiler function to it be loaded
(def compiler-options {:output-to "compiled.js"
                       :main 'demo.main})

(cljs/build "cljs" compiler-options)