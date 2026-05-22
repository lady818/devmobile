# Développement Mobile 

Lab Android (Java) : application **BibliothequeApp**.

## Labs

| Lab | Thème | Statut dans le code |
|-----|-------|-------------------|
| 1 | Installation Android Studio / SDK / émulateur | 
| 2 | Structure projet Android | 
| 3 | Écran d'accueil (TextView, ImageView, Button) |
| 4 | Liste de livres avec RecyclerView | 
| 5 | Navigation + fiche détail |
| 6 | Formulaire ajout / modification | 
| 7 | Persistance Room | 

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


## Auteur
Mame Sadio Guisse 
Travail réalisé dans le cadre du module Développement Mobile — L2.
