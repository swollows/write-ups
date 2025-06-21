from app.services import deactivate_all_users_graphql

def deactivate_users_task(app):
    with app.app_context():
        deactivate_all_users_graphql()
