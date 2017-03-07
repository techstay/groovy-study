import yitian.study.dao.User
import yitian.study.dao.UserRepositoryUtils

def name = params['name']
def user = new User(name: name)
def repository = UserRepositoryUtils.userRepository
repository.add(user)

response.sendRedirect('index.groovy')