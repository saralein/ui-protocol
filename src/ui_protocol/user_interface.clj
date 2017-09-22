(ns ui-protocol.user-interface
  (:require [ui-protocol.input-output :as io]))

(defprotocol UI
  (display-prompt [this message])
  (get-input [this])
  (prompt-for-input [this message]))

(defrecord ConsoleUI [console-io]
  UI
  (display-prompt
    [this message]
    (io/display console-io message))

  (get-input
    [this]
    (io/input console-io))

  (prompt-for-input
    [this message]
    (.display-prompt this message)
    (.get-input this)))

(defn create-console-ui
  [console-io]
  (map->ConsoleUI {:console-io console-io}))
