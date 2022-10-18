;; Call the ClojureScript Compiler as function
(require '[cljs.build.api :as cljs])

;; Compiler options:
;; :output-to = define the name of the output file
;; - :main = tells the namespace of main goog compiler function to it be loaded
;; :optimizations = optimizations for smaller builds. many options, consult on wiki
;;                  in any optimized build all files are bundled in compiled.js so
;;                  no need to define :main anymore.
(def compiler-options {:output-to "compiled.js"
                       :optimizations :whitespace})

;; Compiler build function
;; this function compile the ClojureScript source to JS.
;; args:
;;   path = the folder where the source is, in this case CLJS.
;;   compiler-options = a map with the compiler options.
(cljs/build "cljs" compiler-options)