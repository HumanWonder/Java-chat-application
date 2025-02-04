# 📌 Guide des messages de commit Git

## 📜 Règles générales
1. **Chaque commit doit être clair et précis**.
2. **Utiliser des verbes à l'impératif** (exemple : "Ajoute", "Corrige", "Refactore").
3. **Un commit doit représenter un changement logique unique**.
4. **Ne pas inclure plusieurs fonctionnalités ou corrections dans un même commit**.
5. **Suivre la convention :**
   ```
   <type>(scope): message court et descriptif
   ```

## 📌 Types de commit
Voici les principaux types de commit à utiliser :

| Type       | Signification |
|------------|--------------|
| `feat`     | Ajout d'une nouvelle fonctionnalité |
| `fix`      | Correction d'un bug |
| `refactor` | Réécriture du code sans modifier son comportement |
| `chore`    | Maintenance (mise à jour des dépendances, configs, etc.) |
| `test`     | Ajout ou modification de tests |
| `docs`     | Modification de la documentation |
| `style`    | Changement de mise en forme (indentation, renommage) |
| `perf`     | Optimisation des performances |
| `ci`       | Changement lié à l'intégration continue (CI/CD) |

## 📌 Structure d'un commit

Chaque message de commit doit suivre cette structure :

```
<type>(scope): message court et descriptif

Description plus détaillée si nécessaire.

- Explication du contexte et du problème résolu
- Ce qui a été modifié
- Impact sur le projet

Closes #<numéro_issue> (si lié à une issue)
```

## 📌 Exemples de bons commits
```bash
feat(auth): ajoute la gestion de l'authentification des utilisateurs

Ajout d'un système d'authentification basé sur JWT.
- Création d'un endpoint /login
- Vérification des identifiants en base de données
- Génération d'un token JWT

Closes #12
```

```bash
fix(chat): corrige l'affichage des messages en temps réel

Correction du bug qui empêchait l'affichage des nouveaux messages dans le chat.
Problème dû à une mauvaise mise à jour du state côté client.
```

```bash
refactor(server): optimise la gestion des connexions websocket

Réduction de l'utilisation de mémoire en supprimant les références inutiles.
Ajout d'une meilleure gestion des erreurs en cas de déconnexion brutale.
```

## ❌ Exemples de mauvais commits à éviter

❌ `Update file.java`

❌ `Fix bug`

❌ `modif`

❌ `ajout de feature`

Ces commits sont trop vagues et ne décrivent pas clairement les changements.

## 📌 Bonnes pratiques supplémentaires
- **Utiliser `git commit --amend`** pour modifier le dernier commit si nécessaire.
- **Utiliser `git rebase -i`** pour nettoyer l'historique avant un push final.
- **Toujours rédiger les commits en anglais si l'équipe travaille en anglais.**

---
Ce guide garantit un historique Git clair et structuré. 🚀

