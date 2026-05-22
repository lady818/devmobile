# Rendus par lab (conformes aux PDF du cours)

Le projet **BibliothequeApp** suit la progression des TP. Chaque lab est documenté ci-dessous.

| Lab | Fichiers principaux dans l'app | Comportement |
|-----|-------------------------------|--------------|
| **3** | `WelcomeActivity.java`, `activity_welcome.xml` | Toast « Accès à la liste des livres », puis ouverture de la liste (Lab 4) |
| **4** | `MainActivity`, `Livre.java`, `LivreAdapter`, `item_livre.xml`, `activity_main.xml` | Liste RecyclerView (données Room au Lab 7) |
| **5** | `DetailActivity`, `activity_detail.xml` | Clic sur un livre → fiche détail + bouton retour |
| **6** | `AddEditActivity`, `activity_add_edit.xml`, FAB | Formulaire ajout/modification, validation des champs |
| **7** | `AppDatabase`, `LivreDao`, Room + `ActivityResultLauncher` | Persistance SQLite, clic long Modifier/Supprimer |

## Lancer l'application

1. Ouvrir **BibliothequeApp** dans Android Studio.
2. Run : l'écran **Lab 3** (bienvenue) s'affiche en premier.
3. Bouton **Voir les livres** → Toast puis **liste** (Labs 4–7).

## Tests Lab 7 (persistance)

1. Ajouter un livre avec le bouton **+**.
2. Fermer complètement l'app, relancer → le livre est toujours là.
3. Clic long sur un livre → Modifier ou Supprimer.

## Labs 1 et 2

Installation Android Studio, SDK, émulateur : à faire localement (pas de code dans ce dépôt).
