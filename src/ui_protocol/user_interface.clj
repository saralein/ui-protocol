(ns ui-protocol.user-interface)

(defprotocol UI
  (display-prompt [this message])
  (get-input [this])
  (prompt-for-input [this message]))

(defrecord ConsoleUI []
  UI
  (display-prompt
    [this message]
    (println message))

  (get-input
    [this]
    (read-line))

  (prompt-for-input
    [this message]
    (.display-prompt this message)
    (.get-input this)))

(defn create
  []
  (map->ConsoleUI {}))
