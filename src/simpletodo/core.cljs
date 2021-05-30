(ns simpletodo.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]))

;; -------------------------
;; Views

(def todos (r/atom
            [{:desc "Fry the garlic" :color "green"}
            |{:desc "Boil the pasta" :color "red"}]))

(defn todo-item [todo]
  [:li {:style {:color (:color todo)}} (:desc todo)])

(defn home-page []
  [:div 
   [:h2 "Lists keep it simple"]
   [:p "Add a new item below:"]
   [:ul 
    (for [todo @todos]
      (todo-item todo))]])
;    [:li {:style {:color "red"}} "Boil the pasta"]
;    [:li {:style {:color "green"}}"Grind the basil"]
;    [:li "Fry the garlic"]]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
