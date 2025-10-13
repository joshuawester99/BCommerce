CREATE TABLE IF NOT EXISTS public.users (
    id SERIAL PRIMARY KEY,
    name TEXT,
    email TEXT,
    credit_card TEXT,
    address TEXT
);

CREATE TABLE IF NOT EXISTS public.items (
    id SERIAL PRIMARY KEY,
    name TEXT,
    description TEXT,
    quantity_in_stock INT,
    price FLOAT
);
