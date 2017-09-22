(ns ui-protocol.core
  (:gen-class)
  (:require [ui-protocol.input-output :as io]
            [ui-protocol.user-interface :as ui]))

(defn -main
  []
  (let [example-io (io/create-console-io)
        example-ui (ui/create-console-ui example-io)]
    (ui/prompt-for-input example-ui "Please enter a number: ")))
