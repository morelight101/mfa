(ns mfa.views
  (:require
   [re-frame.core :as re-frame]
   [mfa.subs :as subs]
   [mfa.events :as events]))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Counter:" @name]
     [:button {:on-click #(re-frame/dispatch [::events/inc inc ])} "Increase"]
     [:button {:on-click #(re-frame/dispatch [::events/dec dec ])} "Decrease"]]))

 
