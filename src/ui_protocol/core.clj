(ns ui-protocol.core
  (:gen-class)
  (:require [ui-protocol.user-interface :as ui]))

(defn -main
  []
  (let [example-ui (ui/create)]
    (ui/display-prompt example-ui "Hi.")))
