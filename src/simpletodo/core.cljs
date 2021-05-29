(ns simpletodo.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]))

;; -------------------------
;; Views

(defn home-page []
  [:div [:h2 "Lists keep it simple"]
   [:ul 
    [:li "Boil the pasta"]
    [:li "Grind the basil"]
    [:li "Fry the garlic"]]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
