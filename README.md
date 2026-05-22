# Développement Mobile — Pr. Ibrahima FALL (ESP)

Projet de laboratoires Android (Java) : application **BibliothequeApp**.

## Structure du dépôt

| Dossier / fichier | Contenu |
|-------------------|---------|
| `labs/` | Énoncés PDF des labs 1 à 7 |
| `BibliothequeApp/` | Projet Android Studio (code source) |

## Labs

| Lab | Thème | Statut dans le code |
|-----|-------|-------------------|
| 1 | Installation Android Studio / SDK / émulateur | Configuration locale (pas de code) |
| 2 | Structure projet Android | Documentation |
| 3 | Écran d'accueil (TextView, ImageView, Button) | Intégré dans l'évolution du projet |
| 4 | Liste de livres avec RecyclerView | `Livre`, `LivreAdapter`, `item_livre.xml` |
| 5 | Navigation + fiche détail | `DetailActivity` |
| 6 | Formulaire ajout / modification | `AddEditActivity`, FAB |
| 7 | Persistance Room | `AppDatabase`, `LivreDao`, SQLite |

## Fonctionnalités de l'application

- Liste des livres (RecyclerView + CardView)
- Clic sur un livre → fiche détail
- Clic long → modifier ou supprimer
- Bouton flottant **+** → ajouter un livre
- Validation du formulaire (champs obligatoires, ISBN ≥ 10 caractères)
- Données persistées avec **Room** (conservées après fermeture de l'app)
- 8 livres de démonstration insérés au premier lancement

## Ouvrir le projet

1. Installer [Android Studio](https://developer.android.com/studio) (via JetBrains Toolbox si demandé en lab 1).
2. Ouvrir le dossier `BibliothequeApp/`.
3. Laisser Gradle synchroniser (Sync Now).
4. Lancer sur un émulateur ou un téléphone (API 24+).

## Compiler en ligne de commande

```bat
cd BibliothequeApp
gradlew.bat assembleDebug
```

L'APK se trouve dans `app/build/outputs/apk/debug/`.

## Technologies

- Java 17
- Android SDK 35 (min SDK 24)
- RecyclerView, CardView, Material FAB
- Room 2.8.4

## Auteur

Travail réalisé dans le cadre du module Développement Mobile — L2.
