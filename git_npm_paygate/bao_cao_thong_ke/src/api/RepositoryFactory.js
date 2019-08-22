
import baocao from "./baocao";

const repositories = {
    baocao: baocao
};

export const RepositoryFactory = {
  get: name => repositories[name]
};
