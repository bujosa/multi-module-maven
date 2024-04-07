# Bit Mono Repo Project

This is a mono-repository for all services related to Bit. The purpose of this repository is to centralize the codebase for easier management, collaboration, and version control. 

## Structure

The repository is structured into different applications and modules. Each application or module resides in its own directory under the `apps` directory.

Currently, the repository includes the following:

- `apps/common`: This module contains common utilities, components, and services that are shared across different applications.
- `apps/product`: This module is responsible for all operations related to products. It includes services for creating, updating, deleting, and fetching product data. It also includes components for displaying product information in the user interface. This module may interact with the `common` for shared utilities and services.
