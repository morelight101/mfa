(ns mfa.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::word-to-guess
 (fn [db]
   (:word-to-guess db)))
