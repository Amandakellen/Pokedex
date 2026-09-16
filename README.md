# Pokedex 📱✨

Este é um projeto de **Pokedex** moderno, desenvolvido utilizando uma arquitetura multi-módulos robusta e as tecnologias mais recentes do ecossistema Android e **Kotlin Multiplatform (KMP)**.

## 🚀 Tecnologias Utilizadas

- **[Kotlin Multiplatform (KMP)](https://kotlinlang.org/docs/multiplatform.html)**: Compartilhamento de código e lógica entre plataformas.
- **[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)**: Interface de usuário declarativa e reativa compartilhada.
- **[Koin](https://insert-koin.io/)**: Framework de Injeção de Dependência (DI) leve e nativo do Kotlin.
- **[Jetpack Navigation Multiplatform](https://developer.android.com/jetpack/compose/navigation)**: Gerenciamento de rotas e navegação entre telas.
- **[Firebase Auth & BOM](https://firebase.google.com/)**: Autenticação de usuários e serviços em nuvem integrados de forma segura.

---

## 🏗️ Arquitetura e Estrutura de Módulos

O projeto adota uma abordagem altamente modularizada, garantindo separação de conceitos, facilidade de manutenção e tempos de build otimizados:

- **`:app`**: O ponto de entrada principal do aplicativo Android. Configura o Firebase, inicializa os módulos do Koin e define o grafo principal de navegação.
- **`:features`**: Módulo base/orquestrador para as funcionalidades de negócio da aplicação.
  - **`:features:onboarding`**: Fluxo inicial de boas-vindas do usuário, introdução e telas de apresentação.
  - **`:features:create_account`**: Fluxo completo de criação de conta e autenticação integrada ao Firebase.
- **`:design_system`**: Biblioteca centralizada de componentes visuais, cores (suporte a Light e Dark Mode), tipografia (`AppTypography`) e espaçamentos (`Spacing`). Garante consistência visual em todo o aplicativo.
- **`:shared`**: Módulo destinado ao compartilhamento de lógica de negócios global, modelos de dados ou utilitários reaproveitáveis.

---

## 🛠️ Como Executar o Projeto

### Pré-requisitos
- **Android Studio** (versão Ladybug ou superior recomendada)
- **JDK 11** ou **JDK 17** configurado no seu ambiente e no Android Studio.

### Passos para Execução

1. **Clonar o Repositório:**
   ```bash
   git clone <url-do-repositorio>
   cd Pokedex
   ```

2. **Sincronizar o Gradle:**
   Abra o projeto no Android Studio e aguarde a sincronização completa do Gradle (`Gradle Sync`).

3. **Adicionar o arquivo do Firebase:**
   Certifique-se de que o arquivo `google-services.json` válido está presente na pasta do módulo `:app` para o correto funcionamento da autenticação.

4. **Compilar e Rodar o App:**
   Selecione a configuração de execução `app` e escolha o seu dispositivo/emulador Android desejado, então clique em **Run**.

   Caso queira compilar via terminal:
   ```bash
   ./gradlew :app:assembleDebug
   ```

---

## 🧪 Testes

O projeto vem configurado com suporte a testes unitários e instrumentados em múltiplos módulos. Para rodar todos os testes do projeto via linha de comando:

```bash
./gradlew test
```
