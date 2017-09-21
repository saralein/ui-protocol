(ns ui-protocol.user-interface)

(defprotocol UI
  (display-prompt [x message])
  (get-input [x]))

(defrecord ConsoleUI []
  UI
  (display-prompt [x message] (println message))
  (get-input [x] (read-line)))

(defn create
  []
  (map->ConsoleUI {}))
