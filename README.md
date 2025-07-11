# 🧠 Bootcamp Java Developer - Simulador de Plataforma de Ensino

Este projeto simula uma plataforma de bootcamps onde desenvolvedores podem se inscrever em cursos e mentorias, progredir em conteúdos, obter certificados, avaliar atividades e acompanhar seu progresso por meio de relatórios e um perfil completo.

---

## 📚 Funcionalidades

- ✅ Inscrição de Devs em cursos, mentorias ou bootcamps completos  
- ✅ Acompanhamento de progresso (conteúdos inscritos, concluídos e XP)  
- ✅ Geração de certificados ao concluir conteúdos  
- ✅ Avaliação de cursos e mentorias  
- ✅ Relatórios (ranking de devs, cursos mais concluídos, médias de avaliação)  
- ✅ Perfil completo do Dev com conquistas, certificados e histórico  
- ✅ Arquitetura orientada a objetos, com uso de herança, abstração e encapsulamento

---

## 🏗️ Estrutura de Classes

- `Dev`: representa o aluno, com métodos de inscrição, progresso, avaliação e acesso ao perfil.
- `Conteudo` *(classe abstrata)*: superclasse para `Curso` e `Mentoria`.
- `Curso`: conteúdo com carga horária.
- `Mentoria`: conteúdo com data e formato de mentoria.
- `Bootcamp`: conjunto de conteúdos com prazo e devs inscritos.
- `Inscricao`: representa o vínculo entre Dev e Conteúdo, com status (ativo, concluído, cancelado).
- `Perfil`: armazena o histórico, certificações e avaliações de um Dev.
- `Certificado`: emitido ao concluir um conteúdo.
- `Avaliacao`: nota e comentário dados por um Dev após conclusão.
- `RelatorioService`: gera estatísticas e relatórios do sistema.

---

## 🧪 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/bootcamp-java-dev.git
cd bootcamp-java-dev
