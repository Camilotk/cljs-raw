;; Call the ClojureScript Compiler as function
(require '[cljs.build.api :as cljs])

;; Compiler options:
;; :output-to = define the name of the output file
;; :optimizations = optimizations for smaller builds. many options, consult on wiki
;;                  in any optimized build all files are bundled in compiled.js so
;;                  no need to define :main anymore.
;; :source-map = add source maps to the project that are bundled in the compiled.js.map.
;; :output-dir = define a folder for the > intermediaries < compiled output.
;;               the compiled files still remains on root.
(def compiler-options {:output-to "compiled.js"
                       :source-map "compiled.js.map"
                       :output-dir "out"
                       :optimizations :simple})

;; Compiler build function
;; this function compile the ClojureScript source to JS.
;; args:
;;   path = the folder where the source is, in this case CLJS.
;;   compiler-options = a map with the compiler options.
(cljs/build "cljs" compiler-options)