(ns mfa.events
  (:require
   [re-frame.core :as re-frame]
   [mfa.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
            db/default-db))

(re-frame/reg-event-db
 ::inc
 (fn [db [_ val]]
   (update db :name val)))

(re-frame/reg-event-db
 ::dec
 (fn [db [_ val]]
   (update db :name val)))


