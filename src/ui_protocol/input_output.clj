(ns ui-protocol.input-output)

(defprotocol IO
  (display [this message])
  (input [this]))

(defrecord ConsoleIO []
  IO
  (display [this message] (println message))
  (input [this] (read-line)))

(defn create-console-io
  []
  (map->ConsoleIO {}))
